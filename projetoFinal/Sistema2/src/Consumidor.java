
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Consumidor extends Thread{
	Consumidor (String nomeArquivo)
	{
		this.nomeArquivo = nomeArquivo;
	Path arq = Paths.get(nomeArquivo);
		try {
			Files.write(arq, Arrays.asList("1,1,[0,0,0]"), Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String nomeArquivo;
}
