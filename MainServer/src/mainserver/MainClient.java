/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainserver;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.Logger;
import mainserver.Client;

/**
 *
 * @author Studenti
 */
public class MainClient {
    public static void main(String[] args) {
    Client c = new Client("Fahim", "blu");
    c.connetti("127.0.0.1", 2000);
    c.chiudi();
    }
}
