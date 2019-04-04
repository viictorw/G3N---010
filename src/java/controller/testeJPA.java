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
import dao.DisponibilidadeeDAO;
import dao.EspacoDAO;
import dao.IrregularidadeDAO;
import dao.ModalidadeDAO;
import dao.ProfessorDAO;
import dao.TipoEspacoDAO;
import model.Cartao;
import model.Cliente;
import model.Contato;
import model.Curso;
import model.Disponibilidadee;
import model.Espaco;
import model.Irregularidade;
import model.Modalidade;
import model.Professor;
import model.TipoEspaco;

/**
 *
 * @author viict
 */
public class testeJPA {

    public static void main(String[] args) {
            
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
        
        Disponibilidadee disponibilidade = new Disponibilidadee("20/12/2019", "10:00", "18:00");
        DisponibilidadeeDAO.getInstance().salvar(disponibilidade);
       
        Espaco espaco = new Espaco("TesteLocalname", "12324", "36049120", "Alver juinoi", 123, "do outro lado", "esse mesmo", "juiz de fuera", "mg", 55.0, 450, "20:00", "06:00");
        EspacoDAO.getInstance().salvar(espaco);
        
        Irregularidade irregularidade = new Irregularidade("Matim", "Ocorreu o seguinte problema", espaco);
        IrregularidadeDAO.getInstance().salvar(irregularidade);
        
        Modalidade modalidade = new Modalidade("Skateeee", "skaiteros");
        ModalidadeDAO.getInstance().salvar(modalidade);
        
        TipoEspaco tipoEspaco = new TipoEspaco("Graminha", modalidade);
        TipoEspacoDAO.getInstance().salvar(tipoEspaco);
    }

}
