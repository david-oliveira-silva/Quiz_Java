package quiz;

public class perguntas {
    private String perguntas;
    private String op1 = "";
    private String op2 = "";
    private String op3 = "";
    private String op4 = "";

    public int acertos ;




    private  String correta = "";

    private  String resposta = "";


    public String getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(String perguntas) {
        this.perguntas = perguntas;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) {
        this.op3 = op3;
    }

    public String getOp4() {
        return op4;
    }

    public void setOp4(String op4) {
        this.op4 = op4;
    }

    public String getCorreta() {
        return correta;
    }

    public void setCorreta(String correta) {
        this.correta = correta;
    }

    public String getResposta() {
        System.out.println("escreva a resposta correta");
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta.toLowerCase();
    }

    public void opcaoCorreta(String correta){
        this.correta = correta;
        if (correta.equals(this.resposta)){
            System.out.println("A resposta esta correta");
        }else {
            System.out.println("A resposta esta errada");
        }
    }



    public void escrevePerguntas(){
        System.out.println(this.perguntas);
        System.out.println(this.op1);
        System.out.println(this.op2);
        System.out.println(this.op3);
        System.out.println(this.op4);
        System.out.println(this.resposta);
        System.out.println(this.correta);
    }
}
