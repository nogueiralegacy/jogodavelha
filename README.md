# Jogo da Velha

## Escopo
Essa aplicação permite duas pessoas jogarem jogo da velha pelo terminal.

## Pre-requisitos para gerar o executável
- Ter a Maquina Virtual Java instalada
- Ter o Maven instalado
    
## Gerar e executar o jar file executável
### Clonar o repositório
- Comando: `git clone https://github.com/nogueiralegacy/jogoDaVelha`

### Acessar a raiz do projeto

### Gerar o jar file executável
- Executar o comando `mvn package -P executavel-unico`

### Executar o jar file
- Basta utilizar o comando `java -jar target\jogoDaVelha-console-exec.jar` para iniciar o jogo
- Pronto agora é só se divertir😁😁

## Arquivo executavel nativo
| Arquivo                                                                                             | Plataforma      |
|-----------------------------------------------------------------------------------------------------|-----------------|
| [jogoDaVelha.exe](https://docs.google.com/uc?export=download&id=1a5H6mmuTmbskagjsa66K4-tm5z7wT5AX)  | Windows 64 bits |


**O arquivo não tem nenhum código malicioso, essas etapas de segurança são feitas por preocaução pelo navegador e pelo sistema operacional.**
**Se tiver qualquer duvida em relação a segurança basta gerar o executável pelo Maven.**


## Executar os testes
- Acessar a raiz do projeto
- Executar o comando `mvn test` 

