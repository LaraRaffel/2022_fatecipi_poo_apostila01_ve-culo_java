public class Veiculo{

	private double velocidade;
	private String modelo;

    public Veiculo(double velocidade, String modelo){
        //this.velocidade = velocidade;
        this.setVelocidade(velocidade);
        //this.modelo = modelo;
        this.setModelo(modelo);
    }

	public void setVelocidade(double v){
		velocidade = v;
	}

	public double getVelocidade(){
		return velocidade;
	}

	public void setModelo (String modelo){
		this.modelo = modelo;
	}

	public String getModelo(){
		return this.modelo;
	}

	public void ré(){
		System.out.println("Dando ré...");
	}

	public void freio(){
		System.out.println("Freiando...");
	}
		
}