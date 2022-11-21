import { useState } from "react"
import { DecimaQuartaAulaItem } from "../../components/DecimaQuartaAulaItem"

export function DecimaQuartaAula() {

    const registers = [
        { id: 1, title: 'Primeiro registro' }
    ]

    const [registerListVisible, setRegisterListVisible] = useState(true)

    function deleteRegisterFromList() {

        console.log("foi deletado");

    }

    return (
        <>

            <h1>Lista de Registros</h1>

            <button onClick={() => setRegisterListVisible(!registerListVisible)}>{`${registerListVisible ? 'Ocultar' : 'Mostrar'} Lista`}</button>

            {

                // Verificação se o State que controla a visibilidade da Lista é True
                registerListVisible ? (

                    <ul>
                        {
                            // Map utilizando o Array "registers"
                            registers.map(
                                register => {
                                    return (
                                        <DecimaQuartaAulaItem
                                            key={register.id}
                                            registerData={register}
                                            deleteRegister={(registerReturned) => deleteRegisterFromList(registerReturned)}
                                        />
                                    )
                                }
                            )
                        }
                    </ul>

                ) : (

                    <p>A lista está oculta</p>

                )

            }

        </>
    )

}