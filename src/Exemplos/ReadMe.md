## Esplicação referente aos códigos: 
- ### O que o aruivo *"Prog01_mat"* faz? 
    - esse código calcula o valor da porcentagem de um todo. De modo que é solicitado ao usuário que informe um valor total :
        > System.out.println("Digite um valor o total:");
        > int valueTot= read.nextInt();
    
    - após isso, é solicitado que o ussuário digite a porcentagem a qual ele deseja descobriri o valor 
        > System.out.println("Digite a porcentagem na qual deseja descobrir o valor real");
        > int percent= read.nextInt(); 

    - e por fim o código realiza o calculo para obter o valor da porcentagem e o imprime no console 
        > int calcPercent= valueTot * percent/100;
        > System.out.println(percent+"% de " + valueTot + " e igual a: "+ calcPercent);

- ### O que o aruivo *"Prog02_poo"* faz?
    - esse código cria uma classe "trianguloRetangulo" e a istancia na classe de execução "main".
    - a classe "trianguloRetangulo" é criada com a seguinte estrutura: 
        - atributos: 
            * int height; -> se refere a altura do triangulo 
            * int width; -> se refere a largura da base do triangulo 
        - métodos: 
            * construtor -> esse método é usado para a criação dos objetos baseados na classe 
            * calculoHipotenusa -> esse método realiza um cálculo que tira a raiz quadrada da soma dos atributos (height e width) multiplicados a si mesmos. 
                > double hipotenusa= Math.sqrt((this.height *this.height) + (this.width * this.width)); 
    
    - na classe de execução a classe é istanciada a apartir do método construtor e em seguida é executado seu método "calculoHipotenusa"

