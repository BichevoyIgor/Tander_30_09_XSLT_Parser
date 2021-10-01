Написать XSLT преобразование, которе приведет xml:

    <articles>
        <articles id_art="1" name="Igor" code="1" username="igoreek" guid="12312435efewf2"/>
        <articles id_art="2" name="Daniil" code="2" username="danches" guid="123dsarfg435efewf2"/>
        <articles id_art="3" name="Petr" code="3" username="petrucho" guid="fhfh4487439ewiuhdfkjh8dsf"/>
    </articles>

к виду:

    <articles>
        <article>
            <id_art>1</id_art>
            <name>Person1</name>
            <code>1</code>
            <username>person</username>
            <guid>12312435efewf2</guid>
        </article>
        <article>
            <id_art>2</id_art>
            <name>Person2</name>
            <code>2</code>
            <username>person2</username>
            <guid>123dsarfg435efewf2</guid>
        </article>
        <article>
            <id_art>3</id_art>
            <name>Person</name>
            <code>3</code>
            <username>person3</username>
            <guid>fhfh4487439ewiuhdfkjh8dsf</guid>
        </article>
    </articles>