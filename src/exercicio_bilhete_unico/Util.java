package exercicio_bilhete_unico;

import java.text.DecimalFormat;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public class Util {
    //banco de dados
    private BilheteUnico[] bilhete = new BilheteUnico[2];
    private int index = 0;

    public void menuPrincipal(){
        int opcao = 0;
        String menu = "1. Administrador\n2.Usuário\n3.Finalizar";

        do {
            opcao = parseInt(showInputDialog(menu));
            //if (opcao == 1) {
                //menuAdm();
            //}
            switch(opcao){
                case 1:
                    menuAdm();
                    break;
            }
        }while(opcao != 3);
    }

    private void menuAdm(){
        int opcao;
        String menu = "MENU ADMINISTRADOR\n";
        menu += "1. Emitir bilhete\n2. Listar bilhetes\n3. Excluir bilhete\n4. Sair";
        do{
            opcao = parseInt(showInputDialog(menu));
            switch (opcao){
                case 1:
                    emitirBilhete();
                    break;
                case 2:
                    listarBilhetes();
                    break;
            }
        }while(opcao != 4);
    }

    private void emitirBilhete(){
        String nome, perfil;
        long cpf;
        if(index<bilhete.length){
            nome=showInputDialog("Nome do usuário: ");
            cpf=parseLong(showInputDialog("CPF do usuário: "));
            perfil=showInputDialog("Perfil do usuário:\nEstudante\nProfessor\nComum");
            bilhete[index] = new BilheteUnico(cpf, nome, perfil);
            index++;
            showMessageDialog(null,"Bilhete emitido com sucesso!");
        }else{
            showMessageDialog(null,"Procure um posto de atendimento!");
        }
    }

    private void listarBilhetes() {
        DecimalFormat df = new DecimalFormat("0.00");
        String aux = "";
        for(int i=0;i<index;i++){
            aux+="Número do bilhete: "+bilhete[i].numero+"\n";
            aux+="Saldo do bilhete: "+df.format(bilhete[i].saldo)+"\n";
            aux+="Nome do usuário: "+bilhete[i].usuario.nome+"\n";
            aux+="Perfil do usuário: "+bilhete[i].usuario.perfil+"\n";
            aux+="CPF do usuário: "+bilhete[i].usuario.cpf+"\n";
            aux+="\n";
        }
        showMessageDialog(null, aux);
    }
}


