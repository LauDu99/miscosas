/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.service;

import academy.learnprogramming.entity.Todo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author 106721781
 */
//Aqui se hacen operaciones CRUD pra las entidades en nuestras aplicaciones
//etiqueta para crear un servicio
//crea una transaccion por cada metodo dinamicamente
@Transactional
public class TodoService {
    
    //interfaz para manejar las identidades
    @PersistenceContext
    EntityManager entityManager;
    
    public Todo createTodo(Todo todo){
        entityManager.persist(todo);
        return todo;
    }
    
    public Todo updateTodo(Todo todo){
        entityManager.merge(todo);
        return todo;
    }
    
    public Todo findTodoById(Long id){
        return entityManager.find(Todo.class,id);
    }
    
    public List<Todo> getTodos(){
        return entityManager.createQuery("SELECT t from Todo t", Todo.class).getResultList();
    }
}
