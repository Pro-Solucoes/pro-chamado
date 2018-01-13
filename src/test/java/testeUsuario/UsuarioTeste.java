/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeUsuario;

import br.com.pro.modelo.Usuario;
import javax.persistence.EntityManager;

import br.com.pro.util.JPAUtil;

/**
 *
 * @author paulo
 */
public class UsuarioTeste {
    public static void main(String[] args) {
         Usuario usuario = new Usuario();
        usuario.setNome("paulo");
        usuario.setLogin("sdsss");
        usuario.setSenha("12312");
       
              
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.merge(usuario);
        em.getTransaction().commit();
        em.close(); 
    }
}
