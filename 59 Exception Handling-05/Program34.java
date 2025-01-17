import java.io.*;
class Demo34{
	public static void main(String [] args){
		try{
			throw new IOException("Stream Closed");
		}catch(NullPointerException np){
		}
	}
}

