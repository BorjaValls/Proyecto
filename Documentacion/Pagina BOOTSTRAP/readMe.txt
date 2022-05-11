De primeras el boton modal no funciona bien con un submit, y aunque el boton
no sea submit no funciona bien si hay requisitos en el formulario.
Lo tenía tal que así:
<div class="mb-3">
                        <div class="row mx-5">
                            <button type="button" class="btn btn-outline-danger" data-bs-toggle="modal" data-bs-target="#exampleModal"><i class="bi bi-send"></i> Enviar <i class="bi bi-send"></i></button>
                            <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                              <div class="modal-dialog">
                                <div class="modal-content">
                                  <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                  </div>
                                  <div class="modal-body">
                                    <p>Modal body text goes here.</p>
                                  </div>
                                  <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                    <button type="button" class="btn btn-primary">Save changes</button>
                                  </div>
                                </div>
                              </div>
                            </div>
                        </div>
                    </div>


Tampoco funciona el toast: 
<button type="button" class="btn btn-outline-danger" id="liveToastBtn"><i class="bi bi-send"></i>  Enviar  <i class="bi bi-send"></i></button>
                            <div class="position-fixed bottom-0 end-0 p-3" style="z-index: 11">
                                <div id="liveToast" class="toast hide" role="alert" aria-live="assertive" aria-atomic="true">
                                  <div class="toast-header">
                                    <img src="..." class="rounded me-2" alt="...">
                                    <strong class="me-auto">Bootstrap</strong>
                                    <small>11 mins ago</small>
                                    <button type="button" class="btn-close" data-bs-dismiss="toast" aria-label="Close"></button>
                                  </div>
                                  <div class="toast-body">
                                    Hello, world! This is a toast message.
                                  </div>
                                </div>
                              </div>


Como no funciona ninguna de las formas he pillado una función de javascript que hace lo mismo y funciona.
No se para que utilizar el badge o como utilizarlo pero ahí esta.
Los botones de login y registrarse no hacen nada.
En Reservar se supone que accede el cliente a reservar un alojamiento y te lleva a un formulario.
Se supone que el boton de Enviar enviaría los datos escritos/elegidos a la base de datos y tal y luego se refleja en la tabla de los datos.
La tabla que hay no tiene nada que ver con la de la reserva.