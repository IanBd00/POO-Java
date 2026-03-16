/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alunocurso;

/**
 *
 * @author alunolab13
 */
public class Aluno{
    private String nome;
    private int matricula;
    private Curso curso;
    
    public Aluno(){}
    
    public Aluno(String nome, int matricula, Curso curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso; 
    } 
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula(){
        return matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public Curso getCurso(){
        return curso;
    }
    
    public void setCurso(Curso curso){
        this.curso = curso;
    }
}
