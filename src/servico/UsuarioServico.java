package servico;

import static javax.persistence.PersistenceContextType.TRANSACTION;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entidades.Usuario;

@Stateless
@LocalBean
public class UsuarioServico {

	@PersistenceContext(name = "dbLeilaoFacil", type = TRANSACTION)
	private EntityManager entityManager;
	
	public void salvarUsuario(Usuario usuario) {
		entityManager.persist(usuario);
	}
}
