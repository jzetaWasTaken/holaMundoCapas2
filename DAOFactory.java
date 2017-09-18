package holaMundoCapas2;

public class DAOFactory{

	public static DAOInterface getDAO(){
		return new DAO();
	}
}
