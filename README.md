# Smart Toolbar Dinâmica — Padrão Command + Reflexão

Projeto acadêmico da disciplina de **Programação Orientada a Objetos Avançada (POOA)** — UCSal.

Implementação do padrão de projeto GoF **Command** com **Java Reflection** e **Anotações Customizadas**, eliminando o acoplamento entre a toolbar e os comandos concretos.

---

## Como funciona

Cada comando é uma classe anotada com `@CommandInfo`. A aplicação descobre e registra os botões automaticamente em tempo de execução — sem nenhuma modificação na classe `Invoker`.

```
@CommandInfo(label = "Night Mode", shortcut = KeyEvent.VK_N)
public class NightModeCommand implements Command { ... }
```

---

## Comandos disponíveis

| Botão | Atalho | Ação |
|---|---|---|
| Night Mode | `N` | Fundo escuro |
| Clear Mode | `C` | Fundo branco |
| Read Mode | `R` | Fundo bege |
| Zen Mode | `Z` | Fundo lavanda |
| Focus Mode | `F` | Exibe "Show Me The Code!" |

---

## Como executar

**Pré-requisitos:** Java 21 e Maven

```bash
./mvnw spring-boot:run
```

---

## Como adicionar um novo comando

1. Crie uma classe no pacote `...command`
2. Implemente a interface `Command`
3. Anote com `@CommandInfo(label = "...", shortcut = KeyEvent.VK_X)`

O botão aparece automaticamente. Nenhuma outra classe precisa ser alterada.

---

## Estrutura do projeto

```
src/main/java/org/edu/ucsal/smart_toolbar/
├── annotation/   → @CommandInfo
├── command/      → comandos concretos
├── dto/          → CommandMDRecord
├── service/      → CommandLoader (reflexão)
├── view/         → Invoker + WorkSpace
└── Main.java     → Spring Boot entry point
```

---

## Stack

- Java 21
- Spring Boot (IoC)
- Java Swing
- org.reflections 0.10.2