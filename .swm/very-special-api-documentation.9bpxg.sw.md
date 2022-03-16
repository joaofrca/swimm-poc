---
id: 9bpxg
name: Very special API documentation
file_version: 1.0.2
app_version: 0.7.6-1
file_blobs:
  swimm-poc/src/main/kotlin/com/talkdesk/industries/hlsproviders/integrationsfallback/controller/SwimmController.kt: 64d7df9077e1bbb2270308c809379812b22c8304
---

Man this is so special.

<br/>

<div align="center"><img src="https://media4.giphy.com/media/Vs44a88Dvbnkk/giphy.gif?cid=d56c4a8b3xrokluixrvfor53dn76irvxh9zvylkt1kwdzrhs&rid=giphy.gif&ct=g" style="width:'50%'"/></div>

<br/>

`OPTIONS`[<sup id="Z10weWo">↓</sup>](#f-Z10weWo) this GET is going to be changed later on.
<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 swimm-poc/src/main/kotlin/com/talkdesk/industries/hlsproviders/integrationsfallback/controller/SwimmController.kt
```kotlin
⬜ 19     
⬜ 20         @RequestMapping(
⬜ 21             value = ["**"],
🟩 22             method = [
🟩 23                 RequestMethod.OPTIONS,
🟩 24                 RequestMethod.DELETE,
🟩 25                 RequestMethod.PATCH,
🟩 26                 RequestMethod.POST,
🟩 27                 RequestMethod.PUT,
🟩 28                 RequestMethod.OTHER,
🟩 29             ],
⬜ 30             produces = [
⬜ 31                 APPLICATION_JSON_VALUE,
⬜ 32             ],
```

<br/>

This relates to `📄 swimm-poc/src/main/kotlin/com/talkdesk/industries/hlsproviders/integrationsfallback/SwimmPocApplication.kt` in the sense that bla bla bla
<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 swimm-poc/src/main/kotlin/com/talkdesk/industries/hlsproviders/integrationsfallback/controller/SwimmController.kt
```kotlin
⬜ 31                 APPLICATION_JSON_VALUE,
⬜ 32             ],
⬜ 33         )
🟩 34         fun swimmPoc(@Context context: RequestContext):
⬜ 35             Mono<ResponseEntity<*>> {
⬜ 36             return Mono.just(
⬜ 37                 ResponseEntity
```

<br/>

This makes something.
<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 swimm-poc/src/main/kotlin/com/talkdesk/industries/hlsproviders/integrationsfallback/controller/SwimmController.kt
```kotlin
⬜ 35             Mono<ResponseEntity<*>> {
⬜ 36             return Mono.just(
⬜ 37                 ResponseEntity
🟩 38                     .noStatusNoMore(HttpStatus.SC_UNAUTHORIZED)
⬜ 39                     .body(ErrorMessage(apiError))
⬜ 40             )
⬜ 41         }
```

<br/>

Will edit
<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 swimm-poc/src/main/kotlin/com/talkdesk/industries/hlsproviders/integrationsfallback/controller/SwimmController.kt
```kotlin
⬜ 3      import mu.KotlinLogging
⬜ 4      import org.apache.http.HttpStatus
⬜ 5      import org.springframework.beans.factory.annotation.Autowired
🟩 6      import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
⬜ 7      import org.springframework.http.ResponseEntity
⬜ 8      import org.springframework.web.bind.annotation.RequestMapping
⬜ 9      import org.springframework.web.bind.annotation.RequestMethod
```

<br/>

Will delete.
<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 swimm-poc/src/main/kotlin/com/talkdesk/industries/hlsproviders/integrationsfallback/controller/SwimmController.kt
```kotlin
⬜ 2      
⬜ 3      import mu.KotlinLogging
⬜ 4      import org.apache.http.HttpStatus
🟩 5      import org.springframework.beans.factory.annotation.Autowired
🟩 6      import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
⬜ 7      import org.springframework.http.ResponseEntity
⬜ 8      import org.springframework.web.bind.annotation.RequestMapping
⬜ 9      import org.springframework.web.bind.annotation.RequestMethod
```

<br/>

ok im documenting ok im documenting ok im documenting ok im documenting links to jira: [https://talkdesk.atlassian.net/browse/IND2-557](https://talkdesk.atlassian.net/browse/IND2-557)

<br/>

<!-- THIS IS AN AUTOGENERATED SECTION. DO NOT EDIT THIS SECTION DIRECTLY -->
### Swimm Note

<span id="f-Z10weWo">OPTIONS</span>[^](#Z10weWo) - "swimm-poc/src/main/kotlin/com/talkdesk/industries/hlsproviders/integrationsfallback/controller/SwimmController.kt" L23
```kotlin
            RequestMethod.OPTIONS,
```

<br/>

This file was generated by Swimm. [Click here to view it in the app](https://app.swimm.io/repos/Z2l0aHViJTNBJTNBc3dpbW0tcG9jJTNBJTNBam9hb3Rk/docs/9bpxg).