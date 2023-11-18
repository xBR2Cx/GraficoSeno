import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.DefaultXYDataset;

import javax.swing.*;

public class GraficoPanel extends JPanel implements ChartPanelConstants{
    public GraficoPanel() {
        // Fuente de datos
        DefaultXYDataset dataset = new DefaultXYDataset();
        // Arreglos con los valores de ang y sal
        double[] ang = {
                0.0, 15.0, 30.0, 45.0, 60.0, 75.0, 90.0, 105.0, 120.0,
                135.0, 150.0, 165.0, 180.0, 195.0, 210.0, 225.0, 240.0,
                255.0, 270.0, 285.0, 300.0, 315.0, 330.0, 345.0, 360.0};
        double[] sal = {
                0.0, 0.23045000000000002, 0.46605, 0.7071000000000001,
                0.8047000000000001, 0.9023500000000001, 1.0,
                0.9023500000000001, 0.8047000000000001, 0.7071000000000001,
                0.47145000000000004, 0.23570000000000002, 0.0,
                -0.23570000000000002, -0.47145000000000004, -0.7071000000000001,
                -0.8047500000000001, -0.9024000000000001, -1.0,
                -0.9023500000000001, -0.8047000000000001, -0.7071000000000001,
                -0.47140000000000004, -0.23570000000000002, 0.0};
        // Agregar los datos al dataset con el nombre "Salida"
        dataset.addSeries("Salida", new double[][]{ang, sal});
        // Crear el gráfico
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Gráfico de salida en función del ángulo", // Título
                "Ángulo (grados)", // Nombre del eje x
                "Salida", // Nombre del eje y
                dataset, // Dataset
                PlotOrientation.VERTICAL, // Orientación
                true, // Mostrar leyenda
                true, // Mostrar tooltips
                false // Mostrar urls
        );
        // Crear el panel que contiene el gráfico
        ChartPanel panel = new ChartPanel(chart);
        // Agregar el panel al GraficoPanel
        this.add(panel);
    }
}
