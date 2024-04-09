/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainserver;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
/**
 *
 * @author Studente
 */
public class Client {
    String nome;
    String colore;
    Socket s;
    
    Client (String nomeDefault, String coloreDefault){
        nome = nomeDefault;
        colore = coloreDefault;
    }
    
    public void connetti(String nomeServer, int portaServer){
        try{
           s = new Socket(nomeServer, portaServer);
        }catch(UnknownHostException ue){
            System.err.println("Errore DNS");
        }catch(IOException ex){
            System.err.println("errore");
        }
    }
    
    public void scrivi(){
        
    }
    
    public void leggi(){
        
    }
    
    public void chiudi(){
        try{
           s.close();
           System.out.println("chiusura connessione");
        }catch(IOException ex){
            System.err.println("errore chiusura connessione");
        }
    }
}
