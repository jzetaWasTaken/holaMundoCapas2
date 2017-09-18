package holaMundoCapas2;

public class Main{
	public static void main(String args[]){
		new Controlador().run(UIFactory.getUI(),DAOFactory.getDAO());
	}
}
