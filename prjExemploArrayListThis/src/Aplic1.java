
import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.Projeto;



/**
 *
 * @author dimas
 */
public class Aplic1 {
    public static void main(String[] args) {             
        //Instanciação        
        FuncionarioHorista funchor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        funchor.setCargo("Programador");

        FuncionarioMensalista funcmen = new FuncionarioMensalista(2020, "Ana Beatriz", "15/08/1999", 2.5);
        funcmen.setCargo("Aux. Administrativo");

        FuncionarioComissionado funccom = new FuncionarioComissionado(3030, "Joao", "10/12/1975", 10);
        funccom.setCargo("Vendedor");

        Departamento dep1 = new Departamento("RH", "Recursos Humanos");
        Departamento dep2 = new Departamento("VD", "Vendas");

        Projeto prj1 = new Projeto("1033", "Seguranca no Trabalho");
        prj1.setDataInicio("18/09/2017");
        prj1.setDataTermino("23/11/2017");

        //estabelece a associação binária 1..*
        //entre um objeto Departamento com um ou mais
        //objetos Funcionario (Horista, Mensalista, Comissionado)
        dep1.addFuncionario(funchor);
        dep1.addFuncionario(funcmen);
        dep2.addFuncionario(funccom);

        //estabelece a associação binária 1..1
        //entre um objeto FuncionarioHorista com
        //um objeto Departamento
        //funchor.setDepartamento(dep1);

        System.out.println("O funcionario " + funchor.getNome()
                + " trabalha no departamento "
                + funchor.getDepartamento().getDescricao());

        //estabelece a associação binária 1..1
        //entre um objeto FuncionarioMensalista com
        //um objeto Departamento
        //funcmen.setDepartamento(dep1);
        System.out.println("\nO funcionario " + funcmen.getNome()
                + " trabalha no departamento "
                + funcmen.getDepartamento().getDescricao());

        //estabelece a associação binária 1..1
        //entre um objeto Funcionariocomissionado com
        //um objeto Departamento
        //funccom.setDepartamento(dep2);
        System.out.println("\nO funcionario " + funccom.getNome()
                + " trabalha no departamento "
                + funccom.getDepartamento().getDescricao());

        dep1.listar();
        dep2.listar();

        //estabelecer a associação binária 1..* entre 
        //um(1) objeto Projeto com um(1) ou mais (*)
        //objetos Funcionarios Horista, Mensalista, Comissionado
        prj1.addFuncionario(funchor);
        prj1.addFuncionario(funcmen);
        prj1.addFuncionario(funccom);

        //estabelecendo a associação binária entre um (1)
        //objeto da classe Funcionario Horista, Mensalista
        //Comissionado com um (1)objeto da classe Projeto
        //funchor.setProjeto(prj1);
        //funcmen.setProjeto(prj1);
        //funccom.setProjeto(prj1);

        prj1.listar(); 
    }    
}
