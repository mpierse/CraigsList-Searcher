package mpierse;

import mpierse.service.CraigslistService;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static CraigslistService craigslistService = new CraigslistService();

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        craigslistService.printIds();
    }
}
