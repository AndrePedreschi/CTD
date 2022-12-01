import "@testing-library/jest-dom";
import { render, fireEvent } from "@testing-library/react";
import { describe, expect } from "vitest";
import { DecimaQuintaAula } from "./lessons/DecimaQuintaAula";


describe('DecimaQuintaAula component', () => {

    it('Deveria ser renderizado em tela', () => {

        const { getByText } = render(<DecimaQuintaAula />)

        expect(getByText('Cadastrar endereços')).toBeInTheDocument()

    })

    it('Fluxo cadastro', () => {

        const { getByLabelText, getByText } = render(<DecimaQuintaAula />)
        const input = getByLabelText('cep')
        const submitButton = getByLabelText('submit-button')

        fireEvent.change(input, { target: { value: '01315000' } })
        fireEvent.click(submitButton)

        setTimeout(() => {

            expect(getByText('Cep: 01315-000')).toBeInTheDocument()

        }, 2000)

    })

})