package com.sarath.practice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * Created by sarath on 11/14/2016.
 */

public class ParseXml extends AppCompatActivity {
    TextView tvParse;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xmlparse);
        tvParse= (TextView)findViewById(R.id.tvParse);
        try{
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

            SAXParser saxParser = saxParserFactory.newSAXParser();

            DefaultHandler defaultHandler = new DefaultHandler(){
                boolean name=false;
                boolean salary= false;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    //super.startElement(uri, localName, qName, attributes);
                    if(qName.equalsIgnoreCase("name"))
                    {
                        name = true;
                    }if(qName.equalsIgnoreCase("salary")){
                        salary=true;
                    }
                }

                @Override
                public void endElement(String uri, String localName, String qName) throws SAXException {
                    super.endElement(uri, localName, qName);
                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                  //  super.characters(ch, start, length);
                    if(name){
                        tvParse.setText(tvParse.getText()+"\n\nName: "+new String(ch,start,length));
                        name=false;
                    }
                    if(salary){
                        tvParse.setText(tvParse.getText()+"\nSalary:"+new String(ch,start,length));
                        salary=false;
                    }
                }

            };
            InputStream is = getAssets().open("file.xml");
            saxParser.parse(is,defaultHandler);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
