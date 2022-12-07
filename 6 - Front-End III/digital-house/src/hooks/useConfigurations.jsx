import { useState, createContext, useContext, useEffect } from "react"

const ConfigContext = createContext()

export function ConfigProvider(props) {

    let configData = {
        theme: 'dark',
        language: 'portuguese'
    }

    const themesAllowed = ['dark', 'light', 'high-contrast']
    const languagesAllowed = ['portuguese', 'english']

    const configLocalStorage = JSON.parse(localStorage.getItem('config'))
    const [config, setConfig] = useState(configLocalStorage === null ? configData : configLocalStorage)
  
    function changeConfig(target, data) {
        
        const themeIsAllowed = themesAllowed.includes(data)
        const languageIsAllowed = languagesAllowed.includes(data)

        if (data !== config.theme && themeIsAllowed && target == 'theme') {
            console.log(data);
            setConfig({...config, theme:data})
        }

        if (data !== config.language && languageIsAllowed && target == 'language') {
            setConfig({...config, language: data})
        }

    }

    useEffect(() => {
        localStorage.setItem('config', JSON.stringify(config))
    }, [config])
    
    return (
        <ConfigContext.Provider value={{ config, changeConfig }}>
            {props.children}
        </ConfigContext.Provider>
    )
}

export function useConfig() {
    const context = useContext(ConfigContext)
    return context
}

