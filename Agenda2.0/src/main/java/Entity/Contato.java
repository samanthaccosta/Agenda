package Entity;

public class Contato {
			private String nome;
			private	String telefone;
			private String email;
			private long id;
			
			
			public String getNome() {
				return nome;
			}
			public String getTelefone() {
				return telefone;
			}
			public void setTelefone(String telefone) {
				this.telefone = telefone;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public long getId() {
				return id;
			} 
			public void setId(long id) {
				this.id = id;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			
			
			 
	/*	@Override
		public String toString() {
			String s = "[";
			s += "Id: "+ id;
			s+= " ,Nome: "+nome;
			s+= " ,Telefone: "+telefone;
			s+= " ,E-mail: "+email+" ]";
			return s;
		}*/
		
}
