import { useEffect, useState } from 'react'

export default function useLocalStorage (key, favoriteMovies) {

    const [localStorage, setLocalStorage] = useState(() => {

            let value

            try {

                value = JSON.parse(window.localStorage.getItem(key) || String(favoriteMovies))

            } catch ( error ) {

                value = favoriteMovies

            }

            return value

    })

    useEffect(
        () => {

            window.localStorage.setItem(key, JSON.stringify(localStorage))

        }, [localStorage]
    )

    return [localStorage, setLocalStorage]

}