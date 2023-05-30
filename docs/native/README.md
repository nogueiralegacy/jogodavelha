# Tutorial
Passo-a-passo de como gerar um executável nativo, da aplicação java, para windows 64 bits.

[Tutorial completo](https://medium.com/graalvm/using-graalvm-and-native-image-on-windows-10-9954dc071311)

#### 1. Faça o download  da ferramenta [GraalVM](https://github.com/graalvm/graalvm-ce-builds/releases/tag/vm-22.3.0) de acordo com o JDK necessário.
Essa ferramenta funciona como um JDK comum, mas tem mais funcionalidades.
#### 2. Descomprima o arquivo .zip
Escolha um diretório a sua escolha e descomprima o arquivo .zip
#### 3. Configure as variáveis de ambiente
- O `PATH` para apontar para a pasta `\bin` do diretório `GraalVM`.
- O `JAVA_HOME` para apontar para o diretório `GraalVM`.

Para fazer isso de uma forma mais prática, disponibilizei um script para windows, [set-graalvm.bat](https://github.com/nogueiralegacy/jogoDaVelha/tree/main/documentacao/utilitario), no diretório de `\documentacao\utilitario`. **É necessário fazer a edição do script de acordo com o caminho em que se encontra o GraalVM no seu computador**. Esse script configura o `PATH` e o `JAVA_HOME` para o GraalVM, somente na tela do promt em que foi utilizado, ou seja, não influência na configuração default utilizada no seu computador.
#### 4. Utilize o comando `gu install native-image`.
Verifique a instalação com o comando `gu list` se você visualizar o componente native-image na lista quer dizer que a instalação foi um sucesso.
#### 5. Instale o Visual Studio Build Tools e o Windows 10 SDK
Siga o link a seguir para instruções mais detalhadas nessa parte [aqui](https://medium.com/graalvm/using-graalvm-and-native-image-on-windows-10-9954dc071311)
#### 6. Após gerar o prompt x64 Native Tools Command Prompt
Utilize o script criado nesse prompt
#### 7. Gere o jar file executável pelo Maven
Na raiz do projeto utilize o comando `mvn package -P executavel-unico`
#### 8. Gerar o código native
Utilize o comando `native-image -jar target\jogoDaVelha-console-exec.jar`
#### 9. Será gerado dois artefatos na raiz `\jogoDaVelha`
- Um arquivo com o nome `\jogoDaVelha-console-exec.build_artifacts.txt` que indica o nome do arquivo executável nativo.
- Um arquivo executável com o nome `\jogoDaVelha-console-exec.exe` e o arquivo executável nativo.
