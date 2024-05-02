public class Terreno extends Propriedade {
    private int numeroCasas;
    private int valorCasa;
    private int valorHotel;
    private boolean hotel;

    public int getNumeroCasas() {
        return this.numeroCasas;
    }

    public void setNumeroCasas(int numeroCasas) {
        this.numeroCasas = numeroCasas;
    }

    public int getValorCasa() {
        return this.valorCasa;
    }

    public void setValorCasa(int valorCasa) {
        this.valorCasa = valorCasa;
    }

    public int getValorHotel() {
        return this.valorHotel;
    }

    public void setValorHotel(int valorHotel) {
        this.valorHotel = valorHotel;
    }

    public boolean getHotel() {
        return this.hotel;
    }

    public void setHotel(boolean hotel) {
        this.hotel = hotel;
    }

    public int calcularAluguel() {
        int aluguel;
        if (this.hotel){
            aluguel = (int) this.getAluguel() * 100;
        } else {
            aluguel = (int) this.getAluguel() * this.numeroCasas;
        }
        return aluguel;
    }

    public boolean comprarCasa() {
        if (this.numeroCasas < 4) {
            this.numeroCasas++;
            return true;
        } else {
            System.out.println("Ação inválida: Não há mais casas disponíveis para esse terreno");
            return false;
        }
        // Jogador consegue comprar casa? (SaldoJogador - PrecoCasa) : retornar erro
    }

    public boolean comprarHotel() {
        if (this.numeroCasas == 0) {
            this.hotel = true;
            return true;
        } else {
            System.out.println("Ação inválida: Não é possível comprar Hotel sem possuir 4 casas");
            return false;
        }
        // Jogador consegue comprar hotel? (SaldoJogador - PrecoHotel) : retornar erro
    }

}
