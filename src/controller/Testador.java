package controller;

import java.net.UnknownHostException;
import com.mongodb.MongoException;

public class Testador {

	public static void main(String[] args) throws UnknownHostException, MongoException {
		Conexao conect = new Conexao();
		conect.buscarLogin();
	}

}
