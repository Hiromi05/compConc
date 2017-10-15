//autor: Carolina Hiromi Kameyama
//		 Elvis Nobrega de Alcantara
//		 Thiago Conceiçao da Silva Costa
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.*;
public class Sistema {
	public static void main(String args[]) {
		if(args.length!=2) {
			System.out.println("ERRO DE ENTRADA\nPor favor, colocar o nome do arquivo de log e a quantidade de assentos.");
			return; 
		}
		Path file = Paths.get(args[0]);
		try {
			Files.write(file, Arrays.asList(args[1], "TESTE DE LOG"), Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		int qtdUsers = 100;
		int qtdAssentos = 5;
		BancoDeDados banco = new BancoDeDados(qtdAssentos);
		Usuario user[] = new Usuario[qtdUsers];
		for(int i = 0;i<qtdUsers;i++) {
			user[i] = new Usuario(i,banco);
		}
		for(int i =0;i < qtdUsers;i++) {
			user[i].start();
		}
	}
}
