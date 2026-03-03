class TV{
  int tamanho de tela= 98;
  int volume = 5;
  int voltagem= 220;
  int canal;
  string marca;

  int aumentarVolume(){
     if (Volume < 10) {
          Volume++;
     }
    return volume;
  
   }

   void ligar (){
    consumo= voltagem * tamanhodetela;
    printf ("o consumo é igual a %d\n", consumo); 
  
  
   }
  
  
  
  
  }










A televisão pode realizar as seguintes ações:

ligar: ao ligar a televisão deve imprimir seu consumo. O consumo deve ser definido pela voltagem multiplicada pela quantidades de polegadas;
desligar;
aumentar e diminuir o volume;
subir e descer canal.
