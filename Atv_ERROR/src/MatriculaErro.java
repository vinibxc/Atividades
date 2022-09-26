public class MatriculaErro extends Exception{
    private int matricula;
    public MatriculaErro(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String getMessage(){
        return "A matrícula " + matricula + " já foi cadastrada anteriormente.";
    }

    //@Override
    //public String toString() {
        //return "A matrícula " + matricula + " já foi cadastrada anteriormente.";
    //}
}
