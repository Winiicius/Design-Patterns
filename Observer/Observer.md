# Qual a finalidade do Padrão Observer?

 O Padrão Observer é um padrão de projeto que permite que um objeto (o “observado”) notifique outros objetos (os “observadores”) sobre mudanças em seu estado.

- Observado: É o objeto que será observado. Ele mantém uma lista de observadores, podendo adicionar ou remove-los quando quiser.

- Observadores: São os objetos que observam o observado. Eles se inscrevem para receber atualizações do observado e executar alguma ação caso necessário.

Quando o estado do observado muda, ele envia uma notificação para todos os observadores. Isso é útil quando a mudança de estado de um objeto precisa afetar outros objetos, sem que eles estejam fortemente acoplados.

[UML](UML-Observer.png)


# Explicando o contexto do código usado
    No exemplo do código utilizado, temos como observado o objeto "SensorSeguranca" que pode emitir eventos caso ele detecte algum movimento ou retornar o status do sistema, quando esses eventos são acionados os observadores("CentralSeguranca", "Mensageiro" e "ControleAlarme") executam as ações necessárias para cada situação

    Nesse código temos a classe Evento, que é o objeto passado para os observadores contendo as informações da mudança de estado

    Nesse exemplo temos a classe abstrata "Observavel" que possui um Set com os observadores interessados e metodos para adicionar e remover os mesmos, o objeto observavel("SensorSegurança") herda dessa classe, deixando o código mais extensível.

    temos também a interface "Observador" com o método "tratarEvento", obrigando a todos os observadores implementarem esse método e executar alguma ação com base no evento acionado


# Como seria sem o uso do padrão?

Sem o uso do Padrão Observer o objeto "SensorSegurança" teria que se acoplar a cada classe observadora separadamente, gerando assim um grande foco de acoplamento

