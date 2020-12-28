package com.example.appintermedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.appintermedia.databinding.FragmentMessageBinding;



 //   final private static ARG_PARAM1 "param1";
 //   final private static ARG_PARAM2 "param2";

    public class MessageFragment extends Fragment {




        private FragmentMessageBinding mBinding;

        public MessageFragment() {
            //Constructor vacío
        }


        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            if (getArguments() != null); {

            }
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            mBinding = FragmentMessageBinding.inflate(inflater,container,false);
            return mBinding.getRoot();
        }

        @Override
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);

            mBinding.idButtonContact.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mBinding.idButtonContact.setVisibility(View.GONE);
                    mBinding.msHolder.setVisibility(View.VISIBLE);
                    mBinding.sendButton.setVisibility(View.VISIBLE);
                }
            });

            mBinding.sendButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mBinding.sendButton.getText().toString().length() != 0) {
                        StringMessage: mBinding.sendButton.getText().toString();

                    } else {
                        Toast.makeText(getContext(), "Ingresar un mensaje", Toast.LENGTH_SHORT)
                                .show();
                    }
                }
            });
        }
            private void sendMessage (String Message) {
                    Intent mIntent = new Intent(Intent.ACTION_SENDTO);
            mIntent.setData(Uri.parse("mailto:"));
            mIntent.putExtra(Intent.EXTRA_EMAIL, "vedac72@gmail.com");
            mIntent.putExtra(Intent.EXTRA_SUBJECT, "Correo de contacto a traves de app");
            mIntent.putExtra(Intent.EXTRA_TEXT, Message);
            startActivity(mIntent);
        }

    }