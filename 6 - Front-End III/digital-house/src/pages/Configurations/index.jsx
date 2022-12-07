import './style.scss'

import { useEffect } from "react"
import { contents } from '../../assets/translate/contents'
import { useConfig } from '../../hooks/useConfigurations'

export function Configurations() {

    // Utilização do Hook useTheme
    const { config, changeConfig } = useConfig()

    return (

        <div className='configurations-component'>

            <h1>{contents.configurationComponent.title[config.language]}</h1>

            <form className='formStyle'>

                <section>

                    <h1>{contents.configurationComponent.sectionTitleTheme[config.language]}</h1>

                    <div>
                        <input type="radio" name="theme" id="light" checked={config.theme === 'light'} onChange={() => changeConfig('theme', 'light')} />
                        <label htmlFor="light">Claro</label>
                    </div>

                    <div>
                        <input type="radio" name="theme" id="dark" checked={config.theme === 'dark'} onChange={() => changeConfig('theme', 'dark')} />
                        <label htmlFor="dark">Escuro</label>
                    </div>

                    <div>
                        <input type="radio" name="theme" id="high-contrast" checked={config.theme === 'high-contrast'} onChange={() => changeConfig('theme', 'high-contrast')}/>
                        <label htmlFor="high-contrast">Alto Contraste</label>
                    </div>

                </section>

                <section className='acessibilidade'>

                    <h1>Acessibilidade</h1>

                    <div >
                        <label htmlFor="language">Letras grandes</label>
                        <input type="checkbox" id="" />
                    </div>

                </section>

                <section className='linguagem'>

                    <h1>Linguagem</h1>

                    <div>
                        {/* <label htmlFor="language">Linguagem</label> */}
                        <select
                            id="language"
                            onChange={event => changeConfig('language', event.target.value)}
                            value={config.language}
                        >
                            <option value="portuguese">Português</option>
                            <option value="english">English</option>
                            
                        </select>
                    </div>

                </section>

            </form>

        </div>

    )

}