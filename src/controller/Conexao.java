package controller;

import java.net.UnknownHostException;


//IMPORTS BD
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.BasicDBObject;


public class Conexao {
	private Mongo conexao;
	private DB db;
	
	public void buscarLogin(String info) throws UnknownHostException, MongoException {
		//this.conexao = new Mongo("localhost", 27017);
		this.conexao = new Mongo();
		this.db = conexao.getDB("testeCasaDeBolos");
		DBCollection col = db.getCollection("users");
		DBCursor cursor = db.getCollection("users").find();
		
		while(cursor.hasNext()){
			System.out.println("START ERROS 1");
			BasicDBObject userAut = (BasicDBObject) cursor.next();
			String a = userAut.getString("pwd");
			String b = "123";
			System.out.println(userAut.get("pwd"));
			if(a.equals(info)){
				System.out.println("START ERROS 2");
				String nome = userAut.getString("name");
				System.out.println(nome);
				break;
			}
		}
		System.out.println("chegamos ao fim CLASSE CONEXAO");
		
/*	
		BasicDBObject userAut = (BasicDBObject) cursor.next();
		System.out.println(userAut.get("comentarios"));
		Object com = userAut.get("comentarios");
		System.out.println(com.pwd);
		
		if(col.getInt(comentarios[0].pwd) == 123) {
			System.out.println("OK");
		}	
*/
	}
}
