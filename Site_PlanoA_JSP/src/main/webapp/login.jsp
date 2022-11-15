<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>

  <meta charset='utf-8'>
  <meta http-equiv='X-UA-Compatible' content='IE=edge'>
  <title>Contato - Plano A</title>
  <meta name='viewport' content='width=device-width, initial-scale=1'>
  <link rel="shortcut icon" href="./imagens/favicon1.ico" type="image/x-icon">

  <!--Icones Bootstrap-->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
  <!--Css CDN-->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <link rel="stylesheet" href="css/estilo.css">

</head>


<body class="text-monospace">

  <!-- Cabeçalho-->
  <header class="container-fluid p-3 text-white  BGMarinho">

    <!-- inicio navbar-->
    <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
      <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
        <svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap">
          <use xlink:href="#bootstrap"></use>
        </svg>
      </a>

      <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0 fs-5">
        <li><a class="navbar-brand" href="./index.html"><img src="imagens/logoClaro_152x72.png" alt="logo plano A"></a>
        </li>
        <li><a href="./index.jsp" class="nav-link px-3 text-white">Home</a></li>
        <li><a href="./login.jsp" class="nav-link px-3 text-white">Planos de Aula</a></li>
        <li><a href="./perguntasFrequentes.jsp" class="nav-link px-3 text-white">Perguntas Frequentes</a></li>
        <li><a href="./sobreNos.jsp" class="nav-link px-3 text-white">Sobre Nós</a></li>
        <li><a href="./contato.jsp" class="nav-link px-3 text-white">Contato</a></li>
        <li>
          <form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3">
            <input type="search" class="form-control form-control-dark" placeholder="Search..." aria-label="Search">
          </form>
        </li>
        <li>
          <!--<a type="button" href="./login.jsp" class="btn" id="BGLaranja">Login</a> -->
          <button type="button" class="btn" id="BGAzulBB">Sign-up</button>
        </li>
      </ul>
    </div>

  </header>


  <main>
    <section class="container-fluid py-4 p-3 BGMarinho text-white">
      
      <!-- formulario de contato-->
      <section class="vh-100">
        <div class="container-fluid h-custom">
          <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-md-9 col-lg-6 col-xl-5">
              <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
                class="img-fluid" alt="Sample image">
            </div>
            <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
              <form>

                <!-- Nao sera usado no momento a parte de redes sociais

                <div class="d-flex flex-row align-items-center justify-content-center justify-content-lg-start">
                  <p class="lead fw-normal mb-0 me-3">Sign in with</p>
                  <button type="button" class="btn btn-primary btn-floating mx-1">
                    <i class="fab fa-facebook-f"></i>
                  </button>
      
                  <button type="button" class="btn btn-primary btn-floating mx-1">
                    <i class="fab fa-twitter"></i>
                  </button>
      
                  <button type="button" class="btn btn-primary btn-floating mx-1">
                    <i class="fab fa-linkedin-in"></i>
                  </button>
                </div>
      
                <div class="divider d-flex align-items-center my-4">
                  <p class="text-center fw-bold mx-3 mb-0">Or</p>
                </div> -->
      
                <!-- Email input -->
                <div class="form-outline mb-4">
                  <input type="email" id="form3Example3" class="form-control form-control-lg"
                    placeholder="admin@admin" />
                  <label class="form-label" for="form3Example3">Email</label>
                </div>
      
                <!-- Password input -->
                <div class="form-outline mb-3">
                  <input type="password" id="form3Example4" class="form-control form-control-lg"
                    placeholder="Digite sua senha" />
                  <label class="form-label" for="form3Example4">Senha</label>
                </div>
      
                <div class="d-flex justify-content-between align-items-center">
                  <!-- Checkbox -->
                  <div class="form-check mb-0">
                    <input class="form-check-input me-2" type="checkbox" value="" id="form2Example3" />
                    <label class="form-check-label" for="form2Example3">
                      Relembrar senha
                    </label>
                  </div>
                  <a href="#!" class="text-warning">Esqueci minha senha</a>
                </div>
      
                <div class="text-center text-lg-start mt-4 pt-2">
                  <a href="./planosDeAula.jsp" type="button" class="btn" id="BGLaranja">Login</a>
                  <p class="small fw-bold mt-2 pt-1 mb-0">Não tem uma conta? <a href="#!"
                      class="link-danger">Registrar</a></p>
                </div>
      
              </form>
            </div>
          </div>
        </div>

    </section>
  </main>


  <footer class="container-fluid p-3 BGMarinho text-white">

    <section class="text-center text-lg-start BGLaranja rounded">

      <div class="container d-flex justify-content-center py-5">
        <button type="button" class="btn btn-secondary btn-lg mx-2 BGMarinho">
          <i class="bi bi-facebook"></i>
        </button>
        <button type="button" class="btn btn-secondary btn-lg mx-2 BGMarinho">
          <i class="bi bi-youtube"></i>
        </button>
        <button type="button" class="btn btn-secondary btn-lg mx-2 BGMarinho">
          <i class="bi bi-instagram"></i>
        </button>
        <button type="button" class="btn btn-secondary btn-lg mx-2 BGMarinho">
          <i class="bi bi-twitter"></i>
        </button>
      </div>

      <!-- Copyright -->
      <div class="text-center text-white p-3 BGAmarelo rounded">
        <p style="color:black;">© 2022 Squad 41</p>
        <a class="text-white" href=" "></a>
      </div>

    </section>
  </footer>


  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
    crossorigin="anonymous"></script>
</body>

</html>