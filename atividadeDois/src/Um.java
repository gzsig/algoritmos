public class Um {
    public static void main(String[] args) {
        int sulI, norteI, tempo;
        double crescimentoSul, crescimentoNorte;
        sulI = 35780;
        norteI = 42000;
        crescimentoSul = 0.0255;
        crescimentoNorte = 0.015;
        tempo = 0;

        for (int i = 0; sulI < norteI; i ++){
            sulI += sulI * crescimentoSul;
            norteI += norteI * crescimentoNorte;
//            System.out.println(tempo);
//            System.out.println("sulI: " + sulI);
//            System.out.println("norteI: " + norteI);
            tempo ++;
        }
        System.out.println(tempo);
    }
}
