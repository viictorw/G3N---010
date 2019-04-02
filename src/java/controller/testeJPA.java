/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CartaoDAO;
import dao.ClienteDAO;
import dao.ContatoDAO;
import dao.CursoDAO;
import dao.EspaccoDAO;
import dao.ProfessorDAO;
import dao.ReservaDAO;
import model.Cartao;
import model.Cliente;
import model.Contato;
import model.Curso;
import model.Espaco;
import model.Professor;
import model.Reserva;

/**
 *
 * @author viict
 */
public class testeJPA {

    public static void main(String[] args) {

        
        /*INICIO TESTE - NÃO FUNCIONA AINDA
        Espaco espaco = new Espaco("TesteLocalname", "12324", "36049120", "Alver juinoi", 123, "do outro lado", "esse mesmo", "juiz de fuera", "mg", 55.0, 450, "20:00", "06:00");
        EspaccoDAO dao1 = EspaccoDAO.getInstance();
        dao1.salvar(espaco);

        Cliente cliente = new Cliente("Ze", "das Couves", "10531612473", "18/08/1994", "viictor.wagner@gmail.com", "123");
        ClienteeDAO dao2 = ClienteeDAO.getInstance();
        dao2.salvar(cliente);

        Reserva reserva = new Reserva("10-04-2019", "05:05", "23:00", (long) 500, 1000.0, (long) 5, espaco, cliente);
        ReservaDAO.getInstance().salvar(reserva);*/

        /*FIM TESTE*/
        
        /* FUNCIONANDO*/
            
        Professor professor = new Professor("Jarvan");
        ProfessorDAO dao1 = ProfessorDAO.getInstance();
        dao1.salvar(professor);
        
        
        Curso curso = new Curso ("Eng Computacao", 3000, "Graducao", 10, professor );
        CursoDAO.getInstance().salvar(curso);
        
        Cliente cliente = new Cliente("Andrézinho", "Torreões", "123456", "13/03/1994", "Andre@gmail.com", "Mamona", curso);
        ClienteDAO.getInstance().salvar(cliente);
        
        Contato contato = new Contato("321654", cliente);
        ContatoDAO.getInstance().salvar(contato);
         
        Cartao cartao = new Cartao("visa", "01/03/2022", "856", cliente);//Por que isso não funciona com Long????????????????????????????????AAAAAAAAAAAAAAAAAAAAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
        CartaoDAO.getInstance().salvar(cartao);
    }

}
