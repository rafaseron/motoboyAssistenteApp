motoboyAssistenteApp
aplicativo mobile para ajudar entregadores a ligar no 0800 do iFood e mandar mensagem no whatsapp para clientes.
desenvolvido em Kotlin para Android nativo.

FOTOS DA VERSÃO FINAL:

![Screenshot_2023-11-10-06-09-58-409_br com rafaseron motoboyassistente](https://github.com/rafaseron/motoboyAssistenteApp/assets/63885470/63977660-4571-4db4-83bb-903002f2f8a5)

![Screenshot_2023-11-10-06-09-49-603_br com rafaseron motoboyassistente](https://github.com/rafaseron/motoboyAssistenteApp/assets/63885470/5546ce9d-ef51-4bc6-a3e5-50e42d586f2c)


COMO FOI FEITA A LÓGICA PARA SER FEITO O APP:

parte iFood

- val constante 0800
- EditText para meio telefone
- EditText para final do numero de telefone
- botão que faz ação de juntar “dados das variaveis” + ”;” + “ID” → depois da uma ação relacionada a call to → https://youtu.be/EAu52DIcj-I?si=H5FQq4e92RLZk3-z

- EditText ID

parte Whatsapp

- EditText para DDI → 55 já preenchido → se não mudar, tem que ser 55
- EditText para DDD
- EditText telefone
- junta tudo e cria um link no molde wa.me/DDI+DDD+telefone
