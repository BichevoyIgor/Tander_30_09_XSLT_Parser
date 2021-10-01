Написать XSLT преобразование, которе приведет xml:

    <articles>
        <articles id_art="1" name="Батон нарезной в/с 0.4кг" code="1010050114" username="WHS" guid="6992B998083711DC87F900093D12899D"/>
        ...
    </articles>

к виду:

    <articles>
        <article>
            <id_art>1</id_art>
            <name>Батон нарезной в/с 0.4кг</name>
            <code>1010050114</code>
            <username>WHS</username>
            <guid>6992B998083711DC87F900093D12899D</guid>
        </article>
       ...
    </articles>
