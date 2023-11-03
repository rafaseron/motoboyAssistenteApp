motoboyAssistenteApp
aplicativo mobile para ajudar entregadores a ligar no 0800 do iFood e mandar mensagem no whatsapp para clientes.
desenvolvido em Kotlin para Android nativo.

FOTO COM ADIÇÃO DE CARDVIEW:

![Captura de tela 2023-11-03 131027](https://github.com/rafaseron/motoboyAssistenteApp/assets/63885470/fb87f804-4039-4c18-b746-a0241be24d86)


FOTOS DO APP PRONTO E FUNCIONAL:

![Screenshot_2023-11-03-02-57-56-059_br com rafaseron motoboyassistente](https://github.com/rafaseron/motoboyAssistenteApp/assets/63885470/9aed57d5-ad95-423f-8eaf-b9d5457a5ad7)

![Screenshot_2023-11-03-02-59-25-586_com miui securitycenter](https://github.com/rafaseron/motoboyAssistenteApp/assets/63885470/b47e4ebe-3646-48d1-9957-8d6837e0d7f9)


![Screenshot_2023-11-03-02-59-32-238_com miui securitycenter](https://github.com/rafaseron/motoboyAssistenteApp/assets/63885470/883f70ed-1847-4609-bc8e-4780a96001df)





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
