import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class readtxt{

	public static void main(String[] args){

		String str;
		//Crear matriz para almacenar valores
		int[][] valoresNumericos = new int[3][8]; //La matriz tiene ese tamaño por que el archivo txt tiene 3 filas de 8 numeros

		int i, j;

		try{
			FileReader lector = new FileReader("/home/edgar/Documentos/archivo.txt"); //Puedes utilizar rutas absolutas o relativas
			BufferedReader buffer = new BufferedReader(lector);

			i = 0;
			while((str = buffer.readLine()) != null){ //Mientras el archivo siga teniendo lineas, seguira avanzando
				String[] valores = str.split(","); //Separa un renglon en valores separados por comas y lo almacena en un string
				
				//Vacia el arreglo de numeros almacenados en la matriz de valores numericos
				for(j = 0; j < valores.length; j++)
					valoresNumericos[i][j] =Integer.parseInt(valores[j]); //Es necesario convertir los datos del archivo de String a int para hacer operaciones
				++i; //Avanzas a la siguiente fila de la matriz
			}

		}
		catch(IOException e){
			//Por si no se puede abrir el archivo, se ejecutaran las instrucciones escritas en el catch
			System.out.println("File Read Error"); 
		}

		//Imprimir la matriz, se puede eliminar si no la quieres mostrar
		for(i = 0; i < 3; i++){
			for(j = 0; j < 8; j++){
				System.out.print(valoresNumericos[i][j] + " ");
			}
			System.out.println();
		}
	}

}