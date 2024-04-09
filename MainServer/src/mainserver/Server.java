/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainserver;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Studente
 */
public class Server {
    ServerSocket serverSocket;
    Socket clientSocket;
    int porta;
    
    public Server(int porta){
        try{
            this.porta = porta;
            serverSocket = new ServerSocket(porta);
            System.out.println("Il server è in ascolto");
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("il server non può mettersi in ascolto");
        }
        
    }
    
    public Socket attendi(){
        //Socket s = null;
        try {
            clientSocket = serverSocket.accept();
            System.out.println("S2 - il server ha stabilito la connessione");
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("il server non può stabilire la connessione con il client");
        }
        
        return clientSocket;
    }
    
    public void scrivi(){
        
    }
    
    public void chiudi(){
        try{
           clientSocket.close();
        }catch(IOException ex){
           System.err.println("errore");
        }
    }
}