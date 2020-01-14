package ufpb.br.Meteorogia;

public class Menu {
    public static void main(String[] args) {
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();
        
        EstatisticasDisplay estatisticaDisplay = new EstatisticasDisplay(estacao);
        MediaDisplay mediaDisplay = new MediaDisplay( estacao );
        PressaoAtmosfericaDisplay pressaoAtmosfericaDisplay = new PressaoAtmosfericaDisplay( estacao );

        estacao.setMedicoes(87, 47, 14.4f);
        estacao.setMedicoes(91, 23, 108.2f);
        estacao.setMedicoes(65, 30, 41.2f);
    }

}
