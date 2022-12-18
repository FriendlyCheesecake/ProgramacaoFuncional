package br.com.ada.OOPII;

import java.io.*;
import java.util.*;

class EscolherInstrutor
{
    //Arrays para instrutor, tentar substituir por uma generics só.
    ArrayList<String> nomeInstrutor =new ArrayList<String>();
    ArrayList<Integer> instrutorApartamento =new ArrayList<Integer>();
    ArrayList<Long> celularInstrutor =new ArrayList<Long>();
    ArrayList<String> senhaInstrutor =new ArrayList<String>();
    ArrayList<String> habilidadeInstrutor =new ArrayList<String>();



    //Arrays para aprendizes, tentar substituir para uma generics só (mas não sei se consigo por causa do scanner)
    ArrayList<String> aprendizNome = new ArrayList<String>();
    ArrayList<Integer> aprendizIdade = new ArrayList<Integer>();
    ArrayList<String> aprendizSenha = new ArrayList<String>();
    ArrayList<Long> aprendizCelular = new ArrayList<Long>();
    ArrayList<Byte> instrutorID =new ArrayList<Byte>();

    void dataAdd() throws IOException {
        Instrutor instrutor1 = new Instrutor("Ana Macedo",302, 942288756l, "795846", "Programação Java" );
        Instrutor instrutor2 = new Instrutor("Thomaz Almeida", 405, 985248715l, "185462", "Crochê");
        Instrutor instrutor3 = new Instrutor("Gabriela Magalhães", 601, 985248715l, "174852", "Origami");
        Instrutor instrutor4 = new Instrutor("Suzzana Bandeira", 312, 998854112l, "848532", "Inglês");
        Instrutor instrutor5 = new Instrutor("Roberto Valero", 402, 981808441l, "889621", "Japonês");
        Instrutor instrutor6 = new Instrutor("Henrique Gomes", 203, 996344788l, "652335", "Estatística");

        List<Instrutor> instrutores = new ArrayList<>();

        instrutores.add(instrutor1);

        nomeInstrutor.add(instrutor1.getNome());
        nomeInstrutor.add(instrutor2.getNome());
        nomeInstrutor.add(instrutor3.getNome());
        nomeInstrutor.add(instrutor4.getNome());
        nomeInstrutor.add(instrutor5.getNome());
        nomeInstrutor.add(instrutor6.getNome());

        instrutorApartamento.add(instrutor1.getApartamento());
        instrutorApartamento.add(instrutor2.getApartamento());
        instrutorApartamento.add(instrutor3.getApartamento());
        instrutorApartamento.add(instrutor4.getApartamento());
        instrutorApartamento.add(instrutor5.getApartamento());
        instrutorApartamento.add(instrutor6.getApartamento());


        celularInstrutor.add(instrutor1.getTelefoneCelular());
        celularInstrutor.add(instrutor2.getTelefoneCelular());
        celularInstrutor.add(instrutor3.getTelefoneCelular());
        celularInstrutor.add(instrutor4.getTelefoneCelular());
        celularInstrutor.add(instrutor5.getTelefoneCelular());
        celularInstrutor.add(instrutor6.getTelefoneCelular());

        senhaInstrutor.add(instrutor1.getSenha());
        senhaInstrutor.add(instrutor2.getSenha());
        senhaInstrutor.add(instrutor3.getSenha());
        senhaInstrutor.add(instrutor4.getSenha());
        senhaInstrutor.add(instrutor4.getSenha());
        senhaInstrutor.add(instrutor4.getSenha());

        habilidadeInstrutor.add(instrutor1.getHabilidade());
        habilidadeInstrutor.add(instrutor2.getHabilidade());
        habilidadeInstrutor.add(instrutor3.getHabilidade());
        habilidadeInstrutor.add(instrutor4.getHabilidade());
        habilidadeInstrutor.add(instrutor5.getHabilidade());
        habilidadeInstrutor.add(instrutor6.getHabilidade());

        FileWriter fw = new FileWriter(new File("C:/instrutores.txt"));
        fw.write(instrutores.toString());
        fw.close();

    }


    void aprendiz() throws Exception
    {
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag)
        {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("\t\t  __________________");
            System.out.println("\t\t |                  |");
            System.out.println("\t\t | Olá, Aprendiz!   |");
            System.out.println("\t\t |__________________|");
            System.out.println(" ");
            System.out.println("1.Login \t 2.Inscreva-se\n");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    if(aprendizCelular.isEmpty())
                    {
                        System.out.println("Inscreva-se primeiro.");
                        Thread.sleep(500);
                        break;
                    }
                    else
                    {
                        loginAprendiz();
                        flag=false;

                    }

                    break;
                case 2:
                    patientRegistration();
                    flag=false;
                    break;


                default:
                    System.out.println("\nEscolha inválida, tente novamente.");
                    flag= true;
                    Thread.sleep(1000);
                    break;
            }
        }
    }


    void loginAprendiz()throws Exception
    {

        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        long mobileNumber;
        byte choice;
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("\t\t  _________________________");
        System.out.println("\t\t |                         |");
        System.out.println("\t\t |         Login 		   |");
        System.out.println("\t\t |_________________________|");

        System.out.println("Número de celular:");
        mobileNumber=sc.nextLong();
        System.out.println("Senha:");
        String password=sc.next();


        boolean flag1=false;
        int j;
        for(j=0; j<= aprendizCelular.size()-1; j++)
        {

            if((aprendizCelular.get(j)).equals(mobileNumber)&&(aprendizSenha.get(j)).equals(password))
            {
                flag1=true;

                break;
            }

        }
        if(flag1==true)
        {
            Thread.sleep(1000);
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("\t\t  ____________________________________");
            System.out.println("\t\t |                                    |");
            System.out.println("\t\t |     Escolha Algo para Aprender!    |");
            System.out.println("\t\t |____________________________________|");
            System.out.println("\n Olá, "+ aprendizNome.get(j)+", veja a lista de habilidades disponíveis e escolha o número de uma opção:");

            for(int i = 0; i<= habilidadeInstrutor.size()-1; i++)
            {
                System.out.println((i+1)+". "+ habilidadeInstrutor.get(i));
            }
            choice=sc.nextByte();
            instrutorID.add(choice);



            while(flag)
            {
                Thread.sleep(1000);

                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("\t\t  _______________________________________________________");
                System.out.println("\t\t |                                                       |");
                System.out.println("\t\t |     Veja os dados do instrutor e entre em contato!    |");
                System.out.println("\t\t |_______________________________________________________|");



                if(choice<= nomeInstrutor.size() && choice>0)
                {
                    System.out.println("\n\nNome: \t "+ nomeInstrutor.get(choice-1)+"\nTelefone celular:  "+ celularInstrutor.get(choice-1)+
                            "\nApartamento" +
                            ": \t "+ instrutorApartamento.get(choice-1));
                    break;
                }
                else
                {
                    System.out.println("\n Escolha um número válido...");
                    flag=true;
                    Thread.sleep(1000);
                }

            }

        }
        else
        {
            System.out.println("Falha no login.");
            Thread.sleep(900);
            flag=false;
        }
    }

    void patientRegistration() throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        long mobileNumber;
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("\n");
        System.out.println("\t\t | Olá, esta é a página de registro: |");
        System.out.println("\n");
        System.out.println("Digite seu nome: ");
        aprendizNome.add(sc.nextLine());
        System.out.println("Digite sua idade: ");
        aprendizIdade.add(sc.nextInt());
        System.out.println("Digite seu número de telefone: ");
        mobileNumber = sc.nextLong();
        long mno;

        boolean flag = true, flag1 = true;

        if (aprendizCelular.isEmpty()) {
            aprendizCelular.add((mobileNumber));
            System.out.println("Digite uma senha: ");
            aprendizSenha.add(sc.next());
            System.out.println("Inscrição feita com sucesso!");

            Thread.sleep(900);
            flag1 = false;

        } else {
            for (i = 0; i <= aprendizCelular.size() - 1; i++) {
                mno = aprendizCelular.get(i);

                if (mno == mobileNumber) {

                    flag1 = false;
                    break;
                }

            }
        }

    }
}
