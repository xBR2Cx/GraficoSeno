import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame ventana = new JFrame();
        GraficoPanel grafico = new GraficoPanel();
        ventana.add(grafico);
        ventana.setSize(800, 600);
        ventana.setTitle("Grafico Seno");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
