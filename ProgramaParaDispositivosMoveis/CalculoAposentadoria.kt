Activity-main.xml

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#FA8072"
    android:orientation="vertical"
    android:padding="16dp"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="10dp"
        android:gravity="center_horizontal"
        android:text="Calcule quanto tempo falta para sua aposentadoria!"
        android:textColor="#FFFFFF"
        android:textSize="20sp"
        android:textStyle="bold" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Escolha o sexo"
        android:textColor="#FFFFFF"
        android:textSize="20sp"
        android:textStyle="bold" />

    <Spinner
        android:id="@+id/spinSexo"
        android:layout_width="match_parent"
        android:layout_height="90dp"
        android:textColor="#FFFFFF"
        android:textStyle="bold" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Digite sua idade!"
        android:textColor="#FFFFFF"
        android:textStyle="bold" />


    <EditText
        android:id="@+id/txtIdade"
        android:layout_width="match_parent"
        android:layout_height="48dp"
        android:hint="Digite sua Idade!"
        android:minHeight="48dp" />


    <Button
        android:id="@+id/btn_Calcular"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Calcular" />

    <TextView
        android:id="@+id/txt_Resultado"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textColor="#FFFFFF" />

</LinearLayout>


MainActivity.kt

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#FA8072"
    android:orientation="vertical"
    android:padding="16dp"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="10dp"
        android:gravity="center_horizontal"
        android:text="Calcule quanto tempo falta para sua aposentadoria!"
        android:textColor="#FFFFFF"
        android:textSize="20sp"
        android:textStyle="bold" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Escolha o sexo"
        android:textColor="#FFFFFF"
        android:textSize="20sp"
        android:textStyle="bold" />

    <Spinner
        android:id="@+id/spinSexo"
        android:layout_width="match_parent"
        android:layout_height="90dp"
        android:textColor="#FFFFFF"
        android:textStyle="bold" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Digite sua idade!"
        android:textColor="#FFFFFF"
        android:textStyle="bold" />


    <EditText
        android:id="@+id/txtIdade"
        android:layout_width="match_parent"
        android:layout_height="48dp"
        android:hint="Digite sua Idade!"
        android:minHeight="48dp" />


    <Button
        android:id="@+id/btn_Calcular"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Calcular" />

    <TextView
        android:id="@+id/txt_Resultado"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textColor="#FFFFFF" />

</LinearLayout>