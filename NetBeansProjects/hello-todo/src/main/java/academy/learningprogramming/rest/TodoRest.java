/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learningprogramming.rest;


import academy.learnprogramming.entity.Todo;
import academy.learnprogramming.service.TodoService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author 106721781
 */
//ruta de la clase
@Path("todo")
//obtenemos los datos como json y lo pasamos al servicio
//obtienees y produces jsons
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TodoRest {
    
    //creando la instancia de la clase todo
    @Inject
    TodoService todoService;
    
    @Path("new")
    @POST
    public Response creatTodo(Todo todo){
        todoService.createTodo(todo);
        
        return Response.ok(todo).build();
    }
    
    @Path("update")
    @PUT
    public Response updateTodo(Todo todo){
        todoService.updateTodo(todo);
        return Response.ok(todo).build();
    }
    
    @Path("{id}")
    @GET
    public Todo getTodo(@PathParam("id")Long id){
        return todoService.findTodoById(id);
    }
    
    @Path("list")
    @GET
    public List<Todo> getTodo(){
        return todoService.getTodos();
    }
    
    public Response markAsComplete(@QueryParam("id") Long id){
        Todo todo = todoService.findTodoById(id);
        todo.setIsCompleted(true);
        //no obliatorio pero confirma que se actualice
        todoService.updateTodo(todo);
        
        return Response.ok(todo).build();
    }
    
}
