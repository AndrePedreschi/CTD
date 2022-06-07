import java.time.LocalDate;

public class Cachorro {

    private Boolean apto;
    private String raca;
    private final Integer anoNascimento;
    private final Double peso;
    private final Boolean chip;
    private final Boolean ferido;
    private final String nome;

    public Cachorro(Boolean apto, String raca, Integer anoNascimento, Double peso, Boolean chip, Boolean  ferido, String nome){
        this.apto = apto;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.chip = chip;
        this.ferido = ferido;
        this.nome = nome;
    }

    public Cachorro(Double peso, Boolean chip, Boolean ferido, String nome, Integer anoNascimento){
        this.peso = peso;
        this.chip  = chip;
        this.ferido = ferido;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }



    /*public Boolean getApto(){
        return this.apto;
    }

     */

    /*public void setApto( Boolean apto){
        this.apto = apto;
    }

     */

    /*public String getRaca (){
        return this.raca;
    }

     */

    /*public void setRaca( String raca){
        this.raca = raca;
    }

     */

    public Integer getAnoNascimento(){
        return this.anoNascimento;
    }

    /*public void setAnoNascimento(Integer anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

     */

    public Double getPeso() {
        return peso;
    }

    /*public void setPeso(Double peso) {
        this.peso = peso;
    }

     */

    public Boolean getChip() {
        return chip;
    }

    /*public void setChip(Boolean chip) {
        this.chip = chip;
    }

     */

    public Boolean getFerido() {
        return ferido;
    }

    /*public void setFerido(Boolean ferido) {
        this.ferido = ferido;
    }

     */

    public String getNome() {
        return nome;
    }

    /*public void setNome(String nome) {
        this.nome = nome;
    }

     */

    // Fim do encapsulamento e inicio dos métodos

    public String idadeChip(){
        System.out.println( System.lineSeparator() +  "A idade do cachorro " + getNome() + " é " + ( LocalDate.now().getYear() - getAnoNascimento()) + " anos");


        if(getChip()){
            return "O cachorro " + getNome() + " possue chip!";
        } else {
            return "O cachorro " + getNome() + " não possue chip!";
        }

    }

    public String adocao(Boolean ferido , Double peso){
        if(ferido || peso <= 5){
            return "O cachorro " + getNome() + " não pode ser adotado!";
        } else {
            return "O cachorro " + getNome() + " pode ser adotado!";
        }
    }

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro(true, "Vira-Lata", 2019,5.1,true,false,"Filpo");

        Cachorro cachorro2 = new Cachorro(4.9, false, true, "Lunna", 2010);


        System.out.println(cachorro1.idadeChip());
        System.out.println(cachorro1.adocao( cachorro1.getFerido() ,cachorro1.getPeso()));


        System.out.println(cachorro2.idadeChip());
        System.out.println(cachorro2.adocao( cachorro2.getFerido() ,cachorro2.getPeso()));

    }
}

