/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercadohiloscajera;

/**
 *
 * @author Pc Smart
 */
public class Supermercadohiloscajera {

   
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente 1", new int[]{2, 2, 1, 5, 2, 3});
        Cliente cliente2 = new Cliente("Cliente 2", new int[]{1, 3, 5, 1, 1});

        long initialTime = System.currentTimeMillis();

        CajeroThread cajero1 = new CajeroThread("cajera 1", cliente1, initialTime);
        CajeroThread cajera2 = new CajeroThread("cajera 2", cliente2, initialTime);

        cajero1.start();
        cajera2.start();

    }

}
