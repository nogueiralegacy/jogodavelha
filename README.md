# Jogo da Velha

## Escopo
    Essa aplicação permite duas pessoas jogarem jogo da velha pelo terminal.

## Pre-requisitos para gerar o executável
    - Ter a Maquina Virtual Java instalada
    - Ter o Maven instalado
    
## Como gerar o jar file executavel
    - Acessar a raiz do projeto `..\jogoDaVelha`
    - Executar o comando `mvn package -P executavel-uncio` para gerar o jar file executavel
    - Executar o comando `java -jar target\jogoDaVelha-console-exec.jar` para iniciar o jogo

## Como executar os testes
    - Acessar a raiz do projeto `..\jogoDaVelha`
    - Executar o comando `mvn test` para executar os testes

## Arquivo executavel nativo
    Arquivo   | Plataforma
    --------- | ------
    [jogoDaVelha-exec-windows-64.exec](https://docs.google.com/uc?export=download&id=1a5H6mmuTmbskagjsa66K4-tm5z7wT5AX) | Windows 64 bits
    
### Como executar o arquivo nativo
    - Fazer o download
    - Selecionar "manter" no navegador
    - Selecionar "Mais informação"
    - Selecionar "Executar de qualquer forma"
    
    **O arquivo não tem nenhum código malicioso, essas etapas de segurança são feitas por preocaução pelo navegador e pelo sistema operacional.**
    **Se tiver qualquer duvida em relação a isso basta olhar o código ou gerar o executável pelo Maven.**

    
